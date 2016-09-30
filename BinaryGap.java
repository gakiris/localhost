class BinaryGap {
	public int BinaryGap(int N){
	
	int N = 1041;
	String gak = Integer.toBinaryString(N);
      //System.out.println(gak);
      int zeroCount = 0;
      int maxZeroCount= 0;
      for (int i = 0; i<gak.length(); i++){
          
          if (gak.charAt(i)=='0')
          {
              zeroCount++;
    	  maxZeroCount = zeroCount;
          }
          else
          {
		  zeroCount = 0;
              //System.out.println("");
              /*if(maxZeroCount>zeroCount)
              {
                  zeroCount = 0;
              }
              else{ 
                  maxZeroCount = zeroCount;
                  zeroCount = 0;
              }*/
          }
            
      }
    return maxZeroCount;
  }
}
