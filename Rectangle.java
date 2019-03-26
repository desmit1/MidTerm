package pkgShape;
import java.lang.Exception;

public class Rectangle extends Shape {
		private int iWidth,iLength;
		
		public Rectangle() {
				
		}
		
		public Rectangle(int iWidth, int iLength) throws Exception {
			
			if(iWidth > 0 && iLength > 0) {
					this.iWidth = iWidth;
					this.iLength = iLength;
			}
			
			else
					throw new IllegalArgumentException("Invalid Length or Width");
		}
		
		public int getiWidth() {
				return iWidth;
		}
		
		public void setiWidth(int iWidth) {
				this.iWidth = iWidth;
		}
		
		public int getiLength() {
				return iLength;
		}
		
		public void setiLength(int iLength) {
				this.iLength = iLength;
		}
		
		@Override
		public double area() {
				return this.iWidth * this.iLength;
		}
		
		@Override
		public double perimeter() {
				return (2 * this.iWidth)+ (2 * this.iLength); 
		}
		
		public int compareTo(Rectangle rectangle) {
				if(this.area() > rectangle.area())
						return 1;
				
				else if(this.area() == rectangle.area())
						return 0;
				
				else
						return -1;
		}
}