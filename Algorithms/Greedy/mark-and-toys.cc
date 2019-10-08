#include <iostream>
#include <iterator>
#include <functional>
#include <algorithm>
#include <vector>
#include <string>
#include <list>
#include <map>
#include <set>
#include <bitset>
#include <stack>
#include <queue>
#include <deque>
#include <cstdlib>
#include <cmath>
#include <limits>

using namespace std;

#define REP(n) for (int i = 0; i < (int) n; i++)
#define REPE(i, a, n) for (int i = a; i < (int) n; i++)
#define ALL(c) (c).begin(), (c).end()

const int MOD = 1000000007;
const double EPSILON = 1e-10;

int
main(int argc, char *argv[]) {
  int n, k;
  cin >> n >> k;
  vector< int > costs;
  REP(n) {
    int val;
    cin >> val;
    costs.push_back(val);
  }
  sort(ALL(costs));
  int cnt = 0;
  for (int cost: costs) {
    if (k >= cost) {
      k -= cost;
      cnt++;
    }
  }
  cout << cnt << endl;
  return 0;
}