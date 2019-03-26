package pkgShape;
import java.util.*;

public class SortByArea implements Comparator<Cuboid> {
	
		public int compare(Cuboid c1, Cuboid c2) {
				return c1.compareTo(c2);
		}
}