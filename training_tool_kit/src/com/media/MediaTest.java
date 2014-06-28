package com.media;
    	// Fig. 21.7: MediaTest.java   	// A simple media player
   	import java.io.File;
   	import java.net.MalformedURLException;
   	import java.net.URL;
   	import javax.swing.JFileChooser;
   	import javax.swing.JFrame;
   
   	public class MediaTest
   	{
      	 // launch the application
      	 public static void main( String args[] )
      	 {
         	 // create a file chooser
         	 JFileChooser fileChooser = new JFileChooser();
   
         	 // show open file dialog
         	 int result = fileChooser.showOpenDialog( null );
   
         	 if ( result == JFileChooser.APPROVE_OPTION ) // user chose a file
         	 {
            	 URL mediaURL = null;
   
            	 try
            	 {
               	 // get the file as URL
               	 mediaURL = fileChooser.getSelectedFile().toURL();
             } // end try
            	 catch ( MalformedURLException malformedURLException )
            	 {
               	 System.err.println( "Could not create URL for the file" );
            	 } // end catch
   
            	 if ( mediaURL != null ) // only display if there is a valid URL
            	 {
               	 JFrame mediaFrame = new JFrame( "Media Tester" );
               	 mediaFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   System.out.println(mediaURL);
               	 MediaPanel1 mediaPanel = new MediaPanel1( mediaURL );
               	System.out.println("media panel created");
               	 mediaFrame.add(mediaPanel);
   
               	 mediaFrame.setSize( 300, 300 );
               	 mediaFrame.setVisible( true );
            	 } // end inner if
         	 } // end outer if
      	 } // end main
   	} // end class MediaTest