/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.support.getImagesData;

import com.support.PosterData;
import java.util.List;

/**
 *
 * @author Kunal
 */
public class GetImages {

    private static List<PosterData> Startimages;
    static List<PosterData> Commedyimages;
    static List<PosterData> CrimeImages;
    static List<PosterData> AdvancherImages;
    static List<PosterData> Mesteryimages;
    static List<PosterData> ActionImages;
    static List<PosterData> HorrorImages;
    static List<PosterData> RomaceImages;
    static List<PosterData> DramaImages;
    SetImages setData;

    public GetImages() {
        this.setData = new SetImages();
    }

    public void setStartimages() {
        GetImages.Startimages = setData.setImages();
        System.out.println("Done Starting ....");
    }

    public void setCommedyimages() {
        GetImages.Commedyimages = setData.setimagescommedy();
        System.out.println("Done Commedy...");
    }

    public void setCrimeImages() {
        GetImages.CrimeImages = setData.setimagescrime();
        System.out.println("Done Crime...");
    }

    public void setAdvancherImages() {
        GetImages.AdvancherImages = setData.setimagesadvencher();
        System.out.println("Done Adventure...");
    }

    public void setMesteryimages() {
        GetImages.Mesteryimages = setData.setimagesmystry();
        System.out.println("Done Mestry...");
    }

    public void setActionImages() {
        GetImages.ActionImages = setData.setimagesaction();
        System.out.println("done Action...");
    }

    public void setHorrorImages() {
        System.out.println("Seting Hooror");
        GetImages.HorrorImages = setData.setimageshorror();
        System.out.println("Done Horror...");
    }

    public void setRomaceImages() {
        GetImages.RomaceImages = setData.setimagesromance();
        System.out.println("Done Rommace...");
    }

    public void setDramaImages() {
        GetImages.DramaImages = setData.setimagesdrama();
        System.out.println("Done Dramma...");
    }
// Images Getter

    public static List<PosterData> getStartimages() {
        return Startimages;
    }

    public static List<PosterData> getCommedyimages() {
        return Commedyimages;
    }

    public static List<PosterData> getCrimeImages() {
        return CrimeImages;
    }

    public static List<PosterData> getAdvancherImages() {
        return AdvancherImages;
    }

    public static List<PosterData> getMesteryimages() {
        return Mesteryimages;
    }

    public static List<PosterData> getActionImages() {
        return ActionImages;
    }

    public static List<PosterData> getHorrorImages() {
        return HorrorImages;
    }

    public static List<PosterData> getRomaceImages() {
        return RomaceImages;
    }

    public static List<PosterData> getDramaImages() {
        return DramaImages;
    }

    public void LoadData() {
//        Start_img_new str = new Start_img_new();
// new GetImages().setStartimages();
//        Thread t1 = new Thread(new Start_img_new());
        Thread t2 = new Thread(new Horror_img());
        Thread t3 = new Thread(new Advanture_thread());
        Thread t4 = new Thread(new Crime_thread());
        Thread t5 = new Thread(new Commmedy_thread());
        Thread t6 = new Thread(new Romace_thread());
        Thread t7 = new Thread(new Drama_thread());
        Thread t8 = new Thread(new mestry_thread());
        Thread t9 = new Thread(new Action_htread());

//        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();

        System.out.println("Load SucessFully.....");
    }

}

class Horror_img implements Runnable {

    @Override
    public void run() {
        new GetImages().setHorrorImages();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class Start_img_new implements Runnable {

    @Override
    public void run() {
        new GetImages().setStartimages();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class Action_htread implements Runnable {

    @Override
    public void run() {
        new GetImages().setActionImages();
    }

}

class Advanture_thread implements Runnable {

    @Override
    public void run() {
        new GetImages().setAdvancherImages();
    }

}

class Commmedy_thread implements Runnable {

    @Override
    public void run() {
        new GetImages().setCommedyimages();
    }

}

class Crime_thread implements Runnable {

    @Override
    public void run() {
        new GetImages().setCrimeImages();
    }

}

class Drama_thread implements Runnable {

    @Override
    public void run() {
        new GetImages().setDramaImages();
    }

}

class mestry_thread implements Runnable {

    @Override
    public void run() {
        new GetImages().setMesteryimages();
    }

}

class Romace_thread implements Runnable {

    @Override
    public void run() {
        new GetImages().setRomaceImages();
    }

}
