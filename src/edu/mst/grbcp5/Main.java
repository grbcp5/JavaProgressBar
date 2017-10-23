package edu.mst.grbcp5;

public class Main {

  public static final int PROGRESS_LEN = 20;

  public static void printProgressBar( double pctComplete ) {

    long complete = Math.round( PROGRESS_LEN * pctComplete );

    System.out.print( "\r[" );

    for( int i = 0; i < PROGRESS_LEN; i++ ) {

      if( i < complete ) {
        System.out.print( '#' );
      } else {
        System.out.print( ' ' );
      }

    }

    System.out.print( "]" );


    if( complete >= PROGRESS_LEN ) {
      System.out.print( " Done" );
    } else {
      System.out.print( " " + ( ( int ) ( pctComplete * 100 ) ) + "%" );
    }

  }

  public static void main( String[] args ) {

    double progress1;

    progress1 = 0.0;

    /* Iterations */
    for ( int i = 0; i <= PROGRESS_LEN; i++ ) {

      printProgressBar( progress1 );

      progress1 += 1.0 / PROGRESS_LEN;

      try {
        Thread.sleep( 200 );
      } catch ( InterruptedException e ) {
        e.printStackTrace();
      }

    }


  }

}
