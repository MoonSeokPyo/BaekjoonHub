#include <string>
#include <vector>

using namespace std;

void explore(vector<vector<int>>& node, vector<bool>& check, int num, int& count, vector<int>& length) {
    vector<int> go;
    length[num - 1] = count;
    count++;
    for (int i = 0; i < node[num - 1].size(); i++) {
        if (check[node[num - 1][i] - 1] == false) {
            go.push_back(node[num - 1][i]);
            check[node[num - 1][i] - 1] = true;
        }
    }
    for (int i = 0; i < go.size(); i++) {
        if ((length[go[i] - 1] == 0) || (count < length[go[i] - 1]))
            explore(node, check, go[i], count, length);
        else
            check[go[i] - 1] = false;
    }
    count--;
    check[num - 1] = false;
}

int find(vector<vector<int>>& node, int num) {
    int number = 1, count = 0, count_num;
    vector<int> length(node.size());
    vector<bool> check(node.size(), false);
    check[num - 1] = true;
    explore(node, check, num, count, length);
    count_num = length[0];
    for (int i = 1; i < length.size(); i++) {
        if (count_num < length[i]) {
            count_num = length[i];
            number = 1;
        }
        else if (count_num == length[i])
            number++;
    }
    return number;
}

int solution(int n, vector<vector<int>> edge) {
    int answer = 0;
    vector<vector<int>> node;
    for (int i = 0; i < n; i++) {
        node.push_back(vector<int>());
        for (int j = 0; j < edge.size(); j++) {
            if (i + 1 == edge[j][0])
                node[i].push_back(edge[j][1]);
            else if (i + 1 == edge[j][1])
                node[i].push_back(edge[j][0]);
        }
    }
    answer = find(node, 1);
    return answer;
}