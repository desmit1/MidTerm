package pkgShape;
import java.lang.Exception;

public class Cuboid extends Rectangle{
		private int iDepth;
		
		public Cuboid(int iWidth, int iLength) throws Exception {
				super(iWidth, iLength);
		}

		public Cuboid(int iWidth, int iLength, int iDepth) throws Exception {
				super(iWidth, iLength);
				
				if(iDepth > 0)
						this.iDepth = iDepth;
				
				else
						throw new IllegalArgumentException("Invalid Depth");
		}
		
		public int getiDepth() {
				return iDepth;
		}
		
		public void setiDepth(int iDepth) {
				this.iDepth = iDepth;
		}
		
		@Override
		public double area() {
				return (2 * this.getiLength() * this.getiWidth()) +
								(2 * this.getiLength() * this.iDepth) +
								(2 * this.getiWidth()  * this.iDepth);
		}
		
		public double volume() {
				return this.getiLength() * this.getiWidth() * this.iDepth;
		}
		
		@Override
		public double perimeter() {
				throw new UnsupportedOperationException("Invalid Operation for object");
		}
		
}