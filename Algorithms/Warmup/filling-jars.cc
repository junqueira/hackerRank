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

using namespace std;

#define REP(i, a, n) for (int i = a; i < (int) n; i++)
#define FOR_ITER(c, it) for (typeof(c.begin()) it = c.begin(); it != c.end(); it++)
#define ALL(c) (c).begin(), (c).end()

const int MOD = 1000000007;
const double EPSILON = 1e-10;

long long
calc(long long n, long long m) {
  long long sum;
  for (int i = 0; i < m; i++) {
    long long a, b, k;
    cin >> a >> b >> k;
    sum += (b - a + 1) * k;
  }  
  return sum / n;
}

int
main(int argc, char *argv[]) {
  long long n, m;
  cin >> n >> m;
  cout << calc(n, m) << endl;
  return 0;
}