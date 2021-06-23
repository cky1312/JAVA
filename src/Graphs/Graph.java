package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
    private static class Vertex{
        HashMap<String,Integer> nbrs = new HashMap<>();
    }

    private class Pair{
        String name;
        Vertex vtx;

        String psf; // path so far
    }
    private HashMap<String,Vertex> vtces;

    public Graph(){
        vtces = new HashMap<>();
    }

    public int numVertex(){
        return vtces.size();
    }

    public boolean containsVertex(String vname){
        return vtces.containsKey(vname);
    }

    public void addVertex(String vname){
        Vertex vtx = new Vertex();
        vtces.put(vname,vtx);
//        if(containVertex(vname))
//            return;
//
    }

    public void removeVertex(String vname){
        Vertex vtx = vtces.get(vname);
        ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());
        for(String key : keys){
            Vertex nbrVtx = vtces.get(key);
            nbrVtx.nbrs.remove(vname);
        }
        vtces.remove(vname);
    }

    public int numEdges(){
        Vertex vtx;
        int sumCount = 0;
        ArrayList<String> l = new ArrayList<>(this.vtces.keySet());
        for(String key : l){
            vtx = vtces.get(key);
            sumCount += vtx.nbrs.size();
        }
        return sumCount / 2;
    }

    public boolean containsEdge(String vname1, String vname2){
        Vertex vtx1 = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);
        if(vtx1 == null || vtx2 == null || !(vtx1.nbrs.containsKey(vname2)))
            return false;
        return true;
    }

    public void addEdge(String vname1, String vname2, int cost){
        Vertex vtx1 = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);
        if(vtx1 == null || vtx2 == null || (vtx1.nbrs.containsKey(vname2)))
            return;
        vtx1.nbrs.put(vname2,cost);
        vtx2.nbrs.put(vname1,cost);
    }

    public void removeEdge(String vname1, String vname2){
        Vertex vtx1 = vtces.get(vname1);
        Vertex vtx2 = vtces.get(vname2);
        if(vtx1 == null || vtx2 == null || !(vtx1.nbrs.containsKey(vname2)))
            return;
        vtx1.nbrs.remove(vname2);
        vtx2.nbrs.remove(vname1);
    }

    public void display(){
        System.out.println("--------------------");
        ArrayList<String> arr = new ArrayList<>(vtces.keySet());

        for(String key : arr){
            Vertex vtx = vtces.get(key);
            System.out.println(key + " : " + vtx.nbrs);
        }
        System.out.println("--------------------");
    }

    public boolean hasPath(String vname1, String vname2, HashMap<String, Boolean> processed){

        processed.put(vname1,true);
        // if direct edge is present then return true
        if(containsEdge(vname1,vname2))
            return true;

        Vertex vtx  = vtces.get(vname1);

        ArrayList<String> nbr = new ArrayList<>(vtx.nbrs.keySet());

        for(String key : nbr){
            if(!processed.containsKey(key) && hasPath(key,vname2,processed))
                return true;
        }

        return false;
    }

    public void dft(){
        // stores the data of traversed nodes
        HashMap<String, Boolean> processedNodes = new HashMap<>();

        LinkedList<Pair> stack = new LinkedList<>(); // implementing stack using ll

        ArrayList<String> keys = new ArrayList<>(vtces.keySet());

        for (String key : keys){
            if(processedNodes.containsKey(key))
                continue;

            // create a new pair
            Pair sp = new Pair();
            sp.name = key;
            sp.psf = key;


            stack.addFirst(sp);

            while(!stack.isEmpty()){
                Pair rp = stack.removeFirst();

                if(processedNodes.containsKey(rp.name))
                    continue;

                processedNodes.put(rp.name,true);

                System.out.println(rp.name+" -via- "+rp.psf);

                Vertex rpvtx = vtces.get(rp.name);
                ArrayList<String> ngbrs = new ArrayList<>(rpvtx.nbrs.keySet());

                for (String nbr: ngbrs) {
                    if(!processedNodes.containsKey(nbr)){
                        Pair np = new Pair();
                        np.name = nbr;
//                        np.vtx = vtces.get(nbr);
                        np.psf = rp.psf+nbr;
                        stack.addFirst(np);
                    }
                }
            }

        }
    }
}

