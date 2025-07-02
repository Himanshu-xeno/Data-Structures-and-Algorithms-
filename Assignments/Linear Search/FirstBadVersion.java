/*You're given n versions of a product — versions are numbered from 1 to n.
Somewhere along the way, a version becomes "bad" — and every version after it is also bad.

You have a function isBadVersion(version) which tells you whether a version is bad.

Goal:
Find the first bad version.*/


public class FirstBadVersion {
    public static void main(String[] args) {
        int num = 100;
        int result = firstbad(num);
        System.out.println(result);
    }

    static boolean isBadVersion(int num){
        int bad = 20;
        return num >= bad;
    }

    static int firstbad(int n){
        for (int i = 1; i <= n; i++) {
            if (isBadVersion(i)) {
                return i;
            }
        }
        return -1;
    }
}
