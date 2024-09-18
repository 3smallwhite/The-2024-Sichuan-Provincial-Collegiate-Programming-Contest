/* 2024四川省赛 A
 * 线段树
 */

#include <iostream>

using namespace std;

int n, a[300010];
struct Node {
    int l, r;
    int cnt;          // 染色区间数
    int isl, isr;     // 区间左右端点是否染色
} tr[2000010];
#define lc root * 2
#define rc root * 2 + 1
#define mid (tr[root].l + tr[root].r) / 2
long long ans, res[300010];

void pushup(int root) {
    tr[root].cnt = tr[lc].cnt + tr[rc].cnt;
    if (tr[lc].isr && tr[rc].isl) --tr[root].cnt;
    tr[root].isl = tr[lc].isl, tr[root].isr = tr[rc].isr;
}

void build(int root, int l, int r) {
    tr[root] = {l, r, 0, 0, 0};
    if (l == r) return;
    build(lc, l, (l + r) / 2);
    build(rc, (l + r) / 2 + 1, r);
}

void update(int root, int l) {
    if (tr[root].l == tr[root].r) {
        tr[root].cnt = 1, tr[root].isl = tr[root].isr = 1;
        return;
    }
    if (mid >= l) update(lc, l);
    if (mid < l) update(rc, l);
    pushup(root);
}

int query(int root, int l, int r) {
    if (l <= tr[root].l && tr[root].r <= r) {
        return tr[root].cnt;
    }
    if (mid >= l && mid < r) {
        return query(lc, l, r) + query(rc, l, r) - (tr[lc].isr && tr[rc].isl);
    } else if (mid >= l) {
        return query(lc, l, r);
    } else if (mid < r) {
        return query(rc, l, r);
    }
    return 0;
}

void solve() {
    cin >> n;
    build(1, 1, n);
    for (int i = 1; i <= n; ++i) cin >> a[i];
    a[n + 1] = 3e6, res[n + 1] = 0;
    for (int i = n; i > 0; --i) {
        res[i] = query(1, 1, a[i]);
        if (a[i] > a[i + 1]) {
            ans += res[i] - res[i + 1];
        }
        update(1, a[i]);
    }
    cout << ans << "\n";
}

int main()
{
    solve();
    return 0;
}

/* 样例
9
5 9 1 8 2 6 4 7 3
5
2
1 2
0
*/
