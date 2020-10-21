package homework1;//求矩阵主对角线元素和
public class matrixsum {
    public static void main(String[] args) {
        int sum = 0;
        int array[][] = {{1,2,3,5},{4,5,5,6},{7,8,4,9},{2,5,2,4}};
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if(i==j){
                    sum = sum +array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
