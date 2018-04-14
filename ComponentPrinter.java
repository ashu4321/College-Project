package LoginSys;

	import java.awt.Component;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.print.PageFormat;
	import java.awt.print.Printable;
	import java.awt.print.PrinterException;
	import java.awt.print.PrinterJob;
	import javax.swing.RepaintManager;

	public class ComponentPrinter
	  implements Printable
	{
	  private Component component;
	  
	  public ComponentPrinter(Component com)
	  {
	    this.component = com;
	  }
	  
	  public void print()
	    throws PrinterException
	  {
	    PrinterJob printJob = PrinterJob.getPrinterJob();
	    
	    printJob.setPrintable(this);
	    if (printJob.printDialog()) {
	      printJob.print();
	    }
	  }
	  
	  public int print(Graphics gc, PageFormat pageFormat, int pageIndex)
	  {
	    if (pageIndex > 0) {
	      return 1;
	    }
	    RepaintManager mgr = RepaintManager.currentManager(this.component);
	    Graphics2D g2d = (Graphics2D)gc;
	    
	    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
	    mgr.setDoubleBufferingEnabled(false);
	    this.component.paint(g2d);
	    mgr.setDoubleBufferingEnabled(true);
	    return 0;
	  }
	  
	  public static void printComponent(Component com)
	    throws PrinterException
	  {
	    new ComponentPrinter(com).print();
	  }
	}
