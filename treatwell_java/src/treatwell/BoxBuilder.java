package treatwell;

public class BoxBuilder {

	private int width, height;
	
	/**
	 * BoxBuilder constructor class for generating boxes of various size.
	 * @param width
	 * @param height
	 */
	
	
	public BoxBuilder(int width, int height){
		this.width = width;
		this.height = height;
	}

	/**
	 * Overridden toString function which generates the square.
	 */
	
	@Override
	public String toString(){
		//impossible box given constraints
		if(width <= 1 || height <= 1)
			return "";
		String box = "";
		for( int y = 0; y < height; y++ ){
			for( int x = 0; x < width; x++ ){
				box += getSymbolToPrint(x,y);
			}
		}
		return box;
	}
	
	/**
	 * Takes a coordinate in a square and returns the correct symbol for that position.
	 * @param x
	 * @param y
	 * @return ASCII character for requested position.
	 */
	private String getSymbolToPrint(int x, int y){
		//first column
	    if( x % width == 0 ){
	        if( y % height == 0){
	        	//first row
	            return "┌";
	        }
	        else if( y % height == (height - 1)){
	        	//last row
	            return "└";
	        }
	        else{
	        	//in between
	            return "|";
	        }
	    }
	    //last column
	    else if( x % width == (width - 1)){
	        if( y % height == 0){
	        	//first row
	            return "┐\n";
	        }
	        else if( y % height == (height - 1)){
	        	//last row
	            return "┘";
            }
            else{
            	//in between
	            return "|\n";
	        }
	    }
	    else if( y % height == 0 || y % height == (height - 1)){
	    	//first of last row.
	        return "-";
	    }
	    else{
	    	//in between.
	    	return " ";
	    }
	}

	
	
	public void setWidth(int width){
		this.width = width;
	}
	
	public void setHeight(int height){
		this.height = height;
	}

	public static void main(String[] args) {
		BoxBuilder boxer = new BoxBuilder(8,4);
		System.out.print(boxer.toString());
	}

}
