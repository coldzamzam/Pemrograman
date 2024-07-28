// C++ program for the above approach 

#include <bits/stdc++.h> 
using namespace std; 

// DSU data structure 
// path compression + rank by union 
class DSU { 
	int* parent; 
	int* rank; 

public: 
	DSU(int n) 
	{ 
		parent = new int[n]; 
		rank = new int[n]; 

		for (int i = 0; i < n; i++) { 
			parent[i] = -1; 
			rank[i] = 1; 
		} 
	} 

	// Find function 
	int find(int i) 
	{ 
		if (parent[i] == -1) 
			return i; 

		return parent[i] = find(parent[i]); 
	} 

	// Union function 
	void unite(int x, int y) 
	{ 
		int s1 = find(x); 
		int s2 = find(y); 

		if (s1 != s2) { 
			if (rank[s1] < rank[s2]) { 
				parent[s1] = s2; 
			} 
			else if (rank[s1] > rank[s2]) { 
				parent[s2] = s1; 
			} 
			else { 
				parent[s2] = s1; 
				rank[s1] += 1; 
			} 
		} 
	} 
}; 

class Graph { 
	vector<vector<int> > edgelist; 
	int V; 

public: 
	Graph(int V) { this->V = V; } 

	// Function to add edge in a graph 
	void addEdge(int x, int y, int w) 
	{ 
		edgelist.push_back({ w, x, y }); 
	} 

	void kruskals_mst() 
	{ 
		// Sort all edges 
		sort(edgelist.begin(), edgelist.end()); 

		// Initialize the DSU 
		DSU s(V); 
		int ans = 0; 
		cout << "Following are the edges in the "
				"constructed MST"
			<< endl; 
		for (auto edge : edgelist) { 
			int w = edge[0]; 
			int x = edge[1]; 
			int y = edge[2]; 

			// Take this edge in MST if it does 
			// not forms a cycle 
			if (s.find(x) != s.find(y)) { 
				s.unite(x, y); 
				ans += w; 
				cout << x << " -- " << y << " == " << w 
					<< endl; 
			} 
		} 
		cout << "Minimum Cost Spanning Tree: " << ans; 
	} 
}; 

// Driver code 
int main() 
{ 
	Graph g(14); 
	g.addEdge(1, 2, 1); 
	g.addEdge(1, 4, 2); 
	g.addEdge(2, 6, 3); 
	g.addEdge(5, 8, 4); 
	g.addEdge(7, 8, 5); 
	g.addEdge(6, 8, 6); 
	g.addEdge(2, 7, 7); 
	g.addEdge(6, 7, 8); 
	g.addEdge(5, 6, 9); 
	g.addEdge(4, 7, 10); 
	g.addEdge(3, 7, 11); 
	g.addEdge(4, 5, 12); 
	g.addEdge(1, 3, 13); 
	g.addEdge(2, 4, 14); 

	// Function call 
	g.kruskals_mst(); 

	return 0; 
}

