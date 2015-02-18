package pixLab.classes;
/**

 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testNegate()
  {
	  Picture temple = new Picture("temple.jpg");
	    temple.explore();
	    temple.negate();
	    temple.explore();
  }
  public static void testColorRotate()
  {
	  Picture temple = new Picture("temple.jpg");
	  temple.explore();
	  temple.rotateColorFilter();
	  temple.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.grayscale();
	  water.explore();
  }
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  public static void testMirrorVertical2()
  {
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorVirticalRightToLeft();
	  caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
	  Picture motorcycle = new Picture("redMotorcycle.jpg");
	  motorcycle.explore();
	  motorcycle.mirrorHorizontal();
	  motorcycle.explore();
  }
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  public static void testMirrorWrong()
  {
	  Picture temple = new Picture("temple.jpg");
	  temple.explore();
	  temple.mirrorWrong();
	  temple.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//	  testColorRotate();
//	  testGrayscale();
//	  testFixUnderwater();
//	  testMirrorVertical();
//	  testMirrorVertical2();
//	  testMirrorHorizontal();
	  testMirrorDiagonal();
	  
//	  testMirrorWrong();
 //   testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
//    testNegate();
    //testGrayscale();
    //testFixUnderwater();
//    testMirrorVertical();
//    testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}