package replit;

public class UtopianTree {
    public static void main(String[] args) {



        int growth = 1;
        int treeSize = 0;

        for (int i=1; i<=10; i++){

          if (i<4){
            treeSize+=1;
              System.out.println("year "+i+" - growth "+growth+" cm\ntree size: "+treeSize+" cm");
          } else if (i >=4){
              growth=2;
              treeSize+=2;
              System.out.println("year "+i+" - growth "+growth+" cm\ntree size: "+treeSize+" cm");
          }


        }




    }

}
