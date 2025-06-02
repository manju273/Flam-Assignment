# Flam-Assignment
1. The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.
Example 1: 
Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
Example 2:
Input: n = 1
Output: [["Q"]]
Constraints:
1 <= n <= 9

2. You are building a module loader for a large software system. Each module may depend on one or more other modules. Before loading, you must ensure that the dependencies do not contain any circular dependency, as that would lead to infinite loading loops.
Given a list of N modules and their dependency relationships, determine if the dependency graph contains a cycle.
Function Signature:
bool hasCircularDependency(int n, vector<vector<int>>& edges);
Input:
An integer n representing the number of modules labeled from 0 to n - 1.
A list of edges edges, where each edge[i] = {a, b} means module a depends on module b.
Output:
Return true if there is a circular dependency, otherwise return false. 
