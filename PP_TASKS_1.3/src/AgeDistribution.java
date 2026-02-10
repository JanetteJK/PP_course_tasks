public class AgeDistribution {
    public static void main(String[]args){
        final int REITERATIONS = 1000;
        final int MAXAGE = 31;

        // 20% - 21, 30% - 23, 25% - 25, 25% - 31

        int agedistribution[][] = {
                {20, 21},
                {50, 23},
                {75, 25},
                {100, MAXAGE}
        };

        int generatedAges[] = new int[MAXAGE+1];

        for (int i = 1; i <= REITERATIONS; i++){
            int x = (int)(Math.random()*100)+1; //generating random number
            int j = 0;
            while (x > agedistribution[j][0]) j++;
            generatedAges[agedistribution[j][1]]++;
        }

        System.out.println("Age Count    %-share");
        for (int age = 0; age <= MAXAGE; age++){
            if (generatedAges[age] != 0) {
                String str = "%-4d %-8d %-8.2f \n";
                System.out.printf(str, age, generatedAges[age], ((double)generatedAges[age])/REITERATIONS*100);
            }
        }
    }
}