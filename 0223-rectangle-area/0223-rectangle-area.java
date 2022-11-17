class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ay2-ay1)*(ax2-ax1);
        int area2 = (by2-by1)*(bx2-bx1);
        int l = Math.max(ax1,bx1);
        int r = Math.min(ax2,bx2);
        int x = r-l;
        int t = Math.min(ay2,by2);
        int b = Math.max(ay1,by1);
        int y = t-b;
        int a = x>0&&y>0?x*y:0;
        return area1+area2-a;
    }
}