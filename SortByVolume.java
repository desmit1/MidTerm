package pkgShape;
import java.util.*;

public class SortByVolume implements Comparator<Cuboid>{

		public int compare(Cuboid c1, Cuboid c2) {
				return (int)(c1.volume() - c2.volume());
		}
		
}