public class BackPack {
    public static void main(String[] args) {
        //閺堬拷婢堆冾啇闁插繋璐�10
        int m = 10;
        int n = 3;
        /*
        閺�鎯у弳閻ㄥ嫪绗佹稉顏嗗⒖娴ｆ捇鍣搁柌蹇撳瀻閸掝偂璐�3閿涳拷 4閿涳拷 5閿涙稐鐜崐鐓庡瀻閸掝偂璐�4閿涳拷 5閿涳拷 6
         */
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int c[][] = BackPack_Solution(m, n, w, p);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(c[i][j] + "\t");
                if (j == m) {
                    System.out.println();
                }
            }
        }
        //printPack(c, w, m, n);

    }

    /**
     * @param m 鐞涖劎銇氶懗灞藉瘶閻ㄥ嫭娓舵径褍顔愰柌锟�
     * @param n 鐞涖劎銇氶崯鍡楁惂娑擃亝鏆�
     * @param w 鐞涖劎銇氶崯鍡楁惂闁插秹鍣洪弫鎵矋
     * @param p 鐞涖劎銇氶崯鍡楁惂娴犲嘲锟藉吋鏆熺紒锟�
     */
    public static int[][] BackPack_Solution(int m, int n, int[] w, int[] p) {
        //c[i][v]鐞涖劎銇氶崜宄ｆ禒鍓佸⒖閸濅焦浼嗛弨鎯у弳娑擄拷娑擃亪鍣搁柌蹇庤礋m閻ㄥ嫯鍎楅崠鍛讲娴犮儴骞忓妤冩畱閺堬拷婢堆傜幆閸婏拷
        //闁帗甯瑰蹇ョ窗c[i][m]=max{c[i-1][m-w[i]]+pi , c[i-1][m]}
        int c[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            c[i][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            c[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                //瑜版挾澧块崫浣疯礋i娴犲爼鍣搁柌蹇庤礋j閺冭绱濇俊鍌涚亯缁楃惒娴犲墎娈戦柌宥夊櫤(w[i-1])鐏忓繋绨柌宥夊櫤j閺冭绱漜[i][j]娑撹桨绗呴崚妞捐⒈缁夊秵鍎忛崘鍏哥娑擄拷閿涳拷
                //(1)閻椻晛鎼娑撳秵鏂侀崗銉ㄥ剹閸栧懍鑵戦敍灞惧娴狀櫓[i][j]娑撶[i-1][j]閻ㄥ嫬锟斤拷
                //(2)閻椻晛鎼閺�鎯у弳閼冲苯瀵樻稉顓ㄧ礉閸掓瑨鍎楅崠鍛⒖娴ｆ瑩鍣搁柌蹇庤礋j-w[i-1],閹碉拷娴狀櫓[i][j]娑撶[i-1][j-w[i-1]]閻ㄥ嫬锟界厧濮炴稉濠傜秼閸撳秶澧块崫涔惃鍕幆閸婏拷
                if (w[i - 1] <= j) {
                    if (c[i - 1][j] < (c[i - 1][j - w[i - 1]] + p[i - 1])) {
                        c[i][j] = c[i - 1][j - w[i - 1]] + p[i - 1];
                    } else {
                        c[i][j] = c[i - 1][j];
                    }
                } else {
                    c[i][j] = c[i - 1][j];
                }
            }
        }
        return c;
    }
}