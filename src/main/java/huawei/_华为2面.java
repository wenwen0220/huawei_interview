package huawei;

import java.util.HashSet;
import java.util.Set;
/**
 * Created by jww on 2020/10/31.
 * Describe
 *  * 从原点(0,0)出发，'N','E','S','W',
 *  * 分别代表向北、南、东、西移动一步，
 *  * 如果走到了以前走过的点就返回true，否则返回false
 *  * 如：输入：NES 返回：false
 *  * 输入：NSEWW 返回：true
 *  */

public class _华为2面 {
    public static void main(String[] args) {
        System.out.println(isPathCrossing("NESWW"));
    }

    public static boolean isPathCrossing(String path) {

        if(path.length()==0 || path==null) return false;
        int x = 0;
        int y = 0;
        char[] chars1 = path.toCharArray();
        Set<String> set=new HashSet<>();
        set.add(x+","+y);

        for (int i = 0; i < chars1.length; i++) {
            char c = chars1[i];
            if (c == 'N') {
                x++;
            } else if (c == 'E') {
                y++;
            } else if (c == 'S') {
                x--;
            } else if (c == 'W') {
                y--;
            }
            if(set.contains(x+","+y)){
                return true;
            }else {
                set.add(x+","+y);
            }
        }
        return false;
    }
}
