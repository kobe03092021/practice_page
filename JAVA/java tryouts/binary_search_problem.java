public int guessNumber(int n){
	int low=1;
	int high=n;

	while(low <= high){
		int mid = low+((high-low)/2);
		int result = guess(mid);
		if(result==0){
			return mid;
		}else if(result==1){
			low = mid+1;
		}else{
			high=miid-1;
		}
	}

	return -1;
} 