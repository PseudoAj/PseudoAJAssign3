/*
 * The class is responsible for the setting the data elements and keeping them available for other classes
 * This class also parses the data into usage format.
 */
import java.awt.Point;
import java.awt.geom.Point2D;

import javax.sound.sampled.ReverbType;
public class DataCenter {
	int Rec1_x;
	int Rec1_y;
	int Rec1_z;
	int Rec1_w;
	int Rec1_h;

	int Rec2_x;
	int Rec2_y;
	int Rec2_z;
	int Rec2_w;
	int Rec2_h;
	
	Double L1x;
	Double L1y;
	Double R1x;
	Double R1y;
	
	Double L2x;
	Double L2y;
	Double R2x;
	Double R2y;
	
	Point2D L1;
	Point2D R1;

	Point2D L2;
	Point2D R2;

	public DataCenter(int r1x, int r1y, int r1z, int r1w, int r1h, int r2x,
			int r2y, int r2z, int r2w, int r2h) {
		// TODO Auto-generated constructor stub
		this.Rec1_x=r1x;
		this.Rec1_y=r1y;
		this.Rec1_z=r1z;
		this.Rec1_w=r1w;
		this.Rec1_h=r1h;
		
		this.Rec2_x=r2x;
		this.Rec2_y=r2y;
		this.Rec2_z=r2z;
		this.Rec2_w=r2w;
		this.Rec2_h=r2h;
		
		parseTheData();
	}

	private void parseTheData() {
		// TODO Auto-generated method stub
		/*
		 * The logic for the parsing is as follows:
		 * Given the center and width,heights we can know the edges coordinates:
		 * 1. Starting vertex= (x-h/2,y-w/2)
		 * 2. Other verticies= (x+h/2,y-w/2),(x+h/2,y+w/2),(x-h/2,y+w/2)
		 * 
		 * Input: x,y,z,w,h
		 * Output: (only of they are in the same plane)
		 * l1: top left coordinate of the rectangle1
		 * r1: bottom right coordinate of the rectangle1
		 * l2: top left coordinate of the rectangle2
		 * r2: bottom right coordinate of the rectangle2
		 * 
		 * Rec1_xi: initial x coordinate for Rectangle 1
		 * Rec1_yi: initial y coord for Rectangle 1
		 * 
		 * Rec2_xi: initial x coordinate for Rectangle 2
		 * Rec2_yi: initial y coord for Rectangle 2
		 * 
		 *  
		 */
		System.out.println(Rec1_x+"\t"+Rec1_y+"\t"+Rec1_z+"\t"+Rec1_w+"\t"+Rec1_h+"\t");
		System.out.println(Rec2_x+"\t"+Rec2_y+"\t"+Rec2_z+"\t"+Rec2_w+"\t"+Rec2_h+"\t");
		if(Rec1_z==Rec2_z)
		{
			try
			{
				L1x=(double)(Rec1_x-(Rec1_h/2));
				L1y=(double)(Rec1_y+(Rec1_w/2));
				
				R1x=(double)(Rec1_x+(Rec1_h/2));
				R1y=(double)(Rec1_y-(Rec1_w/2));
				
				
				
				
				L2x=(double)(Rec2_x-(Rec2_h/2));
				L2y=(double)(Rec2_y+(Rec2_w/2));
				
				R2x=(double)(Rec2_x+(Rec2_h/2));
				R2y=(double)(Rec2_y-(Rec2_w/2));
				
				L1=new Point2D.Double(L1x,L1y);
				R1=new Point2D.Double(R1x,R1y);
				
				L2=new Point2D.Double(L2x,L2y);
				R2=new Point2D.Double(R2x,R2y);
				
				double Rec1_xi=(double)(Rec1_x-(Rec1_h/2));
				double Rec1_yi=(double)(Rec1_y-(Rec1_w/2));
				
				double Rec2_xi=(double)(Rec2_x-(Rec2_h/2));
				double Rec2_yi=(double)(Rec2_y-(Rec2_w/2));
				
				if(doOverlap(L1,R1,L2,R2))
				{
					//OverlapCenter olc=new OverlapCenter(L1,R1,L2,R2);
					double left =Math.max(Rec1_xi, Rec2_xi);
					double right =Math.min(Rec1_xi+Rec1_w, Rec2_xi+Rec2_w);
					double top =Math.min(Rec1_yi, Rec2_yi);
					double bottom=Math.max(Rec1_yi+Rec1_h,Rec2_yi+Rec2_h);
					
					double width=right-left;
					double height=bottom-top;
					
					double area=width*height;
					GUIOutput thisout = new GUIOutput("The two rectangles are overlapping and area is:\t"+area);
				}
				else
				{
					GUIOutput thisout = new GUIOutput("The two rectangles are not overlapping");
				}

				
			}
			catch(Exception myEx)
			{
				myEx.printStackTrace();
			}
			
			
		}
		else
		{
			GUIOutput thisout = new GUIOutput("The two rectangles are in Different Planes");
		}
		
		
	}
	
	private boolean doOverlap(Point2D l12, Point2D r12, Point2D l22, Point2D r22) {
		// TODO Auto-generated method stub
		   // If one rectangle is on left side of other
	    if (L1.getX() > R2.getX() || L2.getX() > R1.getX())
	        return false;
	 
	    // If one rectangle is above other
	    if (R1.getY() < R2.getY() || R2.getY() < R1.getY())
	        return false;
	 
	    return true;
	}

}
