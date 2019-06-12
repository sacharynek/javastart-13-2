class TabCalculator {

    int[] processTab(int[] tab, int N) {
        if (N > tab.length / 2) {
            throw new ArrayIndexOutOfBoundsException("Argument N jest za duży!");
        }
        int[][] tabOfTabs = this.divideTabs(tab, N);

        return sumTabs(tabOfTabs);
    }

    private int[][] divideTabs(int[] tab, int N) {
        double tablen = (double) tab.length;
        int lengthOfSubtab = (int) Math.ceil((tablen / N));

        int[][] output = new int[N][lengthOfSubtab];

        int subTabcounter = 0;
        int mainTabcounter = 0;

        while (subTabcounter < tab.length) {
            output[mainTabcounter][subTabcounter % lengthOfSubtab] = tab[subTabcounter];
            subTabcounter++;
            mainTabcounter = subTabcounter / lengthOfSubtab;
        }

        return output;
    }

    private int[] sumTabs(int[][] tabOfTabs) {
        int[] output = new int[tabOfTabs.length];

        for (int i = 0; i < tabOfTabs.length; i++) {
            for (int j = 0; j < tabOfTabs[i].length; j++) {
                output[i] += tabOfTabs[i][j];
            }

        }
        return output;
    }
}
