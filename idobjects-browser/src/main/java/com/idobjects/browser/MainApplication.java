package com.idobjects.browser;

import org.apache.log4j.Logger;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class MainApplication extends SingleFrameApplication{

    private static final Logger LOGGER = Logger.getLogger( MainApplication.class );
    
    @Override protected void initialize( String[] args ){
        DateTime dt = new DateTime();
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss");
        
        LOGGER.info( "Preparing start of IDOBJECTS-BROWSER at "+fmt.print( dt ) );
    }
    
    @Override protected void startup(){
        
    }
    
    
    public static void main( String[] args ){
        Application.launch( MainApplication.class, args );
    }
    
}
