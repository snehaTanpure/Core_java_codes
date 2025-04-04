package collection_code;

import java.util.Comparator;

public class SortPlayerByRun implements Comparator<Player>
{

	@Override
	public int compare(Player o1, Player o2)
	{
       return o1.getRun()>o2.getRun()?1:o1.getRun()<o2.getRun()?-1:0;

	}

}
