import java.util.ArrayList;

/**
 * @author BhaaSw
 * updated by bhaa in 21/01/2024
 */
public class SharedData 
{
	/**
	 * shared data class is the class the all the threads work with
	 * to recive data about the array 
	 */
	private ArrayList<Integer> array = new ArrayList<>();
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * constructor of shared data class
	 * @param array: array list of integers
	 * @param b:the number that we looking for in the array
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return
	 * winArray getter,
	 * winArray changed in public void run() in ThreadCheckAarray.
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray
	 * winArray setter
	 * 
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return 
	 * Array getter
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return
	 * b value getter
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return
	 * flag value getter
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag
	 * flag value setter
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
