/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piccc;

/**
 *
 * @author Morshed's
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Morshed's
 */
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;



public class Mainmm {
  public static void main(String s[]) {
    JFileChooser chooser = new JFileChooser();
   
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "jpg", "gif", "bmp", "png");
    chooser.setFileFilter(filter);
    chooser.setMultiSelectionEnabled(false);
    
    chooser.setCurrentDirectory(new java.io.File("jpg"));
    chooser.setDialogTitle("choosertitle");
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    
    chooser.setAcceptAllFileFilterUsed(false);

    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
      System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
      System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
    } else {
      System.out.println("No Selection ");
    }
  }
}


