class FrekansKarsilastirici implements Comparator<HuffmanNode> {

    @Override
    public int compare(HuffmanNode o1, HuffmanNode o2) {
        int x = o1.frequency;
        int y = o2.frequency;
        if (x<y)
            return -1;
        if (x>y)
            return 1;
        else 
            return 0;
     
   
    }
}
