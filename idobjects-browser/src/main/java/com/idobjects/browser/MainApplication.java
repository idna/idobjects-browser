package com.idobjects.browser;

import java.awt.Font;
import java.util.Locale;

import javax.swing.JLabel;

import org.apache.log4j.Logger;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class MainApplication extends SingleFrameApplication{

    private static final Logger LOGGER = Logger.getLogger( MainApplication.class );

    @Override protected void initialize( String[] args ){
        DateTimeFormatter fmt = DateTimeFormat.forPattern( "dd-MM-yyyy HH:mm:ss" );

        LOGGER.info( "Preparing start of IDOBJECTS-BROWSER at " + fmt.print( new DateTime() ) );
        LOGGER.info( "Default locale =" + Locale.getDefault() );

        Locale.setDefault( Locale.GERMANY );
    }

    @Override protected void startup(){
        // getMainFrame().setTitle( "BasicSingleFrameApp" );
        JLabel label = new JLabel( "Hello, world!" );
        label.setFont( new Font( "SansSerif", Font.PLAIN, 22 ) );
        show( label );
    }

    public static void main( String[] args ){
        Application.launch( MainApplication.class, args );
    }

}
