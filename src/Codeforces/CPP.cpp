#include<bits/stdc++.h>

using namespace std;

int main(){
		int t;
		cin>>t;
        while(t--){
            int n;
			cin>>n;
            
            int d = n;
            while(n >0){
                if(d == 0)
                    break;
                d = d & (n - 1);
                n--;
            }
            cout<<n<<endl;
        }
}
