package com.RS;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }


    public void powerUp() {
        theCase.pressPowerButton(); //accessing the variables directly
        drawLogo(); //calling the drawLogo method
    }


//    composition p2 gets rid of these code
//    public void powerUp() {
//        getTheCase().pressPowerButton();
//        drawLogo();
//    }

    private void drawLogo() {
        //fancy graphics
        monitor.drawPixelAt(1200, 50, "blue");
    }

//    composition gets rid of these code
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}


/*
 * We created this class but at the moment we are not extending this class
 * For the Case field name, we cant put case, because that word is already reserved so we actually get an error
 *
 * Create 3 objects aka the fields and states
 *   private Case , Monitor , Motherboard
 *
 * Create the const/getters for all the fields
 *
 *
 * This style of is helpful because if you use the extends method
 *  you have a option to inherit from one class at a time
 *  thus creates limitations if we use standard inheritance
 *
 * Composition lets the PC class comprises of these other classes manly the case, monitor, motherboard
 *
 *
 *
 * COMPOSITION P2
 * make the getters from public to private
 *   now the main won't able to get the fields and methods
 *   but we can still be able to access those internally
 *
 * Create method called powerUp()
 *   inside
 *    get theCase() and pressPowerButton()
 *    call the drawLogo method that you will create
 *
 * Create another method called drawLogo()
 *  inside
 *   there should be fancy graphics
 *   calls the
 *   monitor drawPixels (3 params)
 *
 * Using th getter or we could access it directly,
 *  accessing the variable directly
 *
 * At the moment we don't really need the getters
 *  it makes the code more complex
 *  if we need them in the future for like
 *   need to check whether the object had been initialized we're looking for
 *   some other form of validation or verification
 *   we might wanna leave those getters in there
 *
 *
 *
 *
 *
 * */