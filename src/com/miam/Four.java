package com.miam;

public class Four {
    public int puissance;
    public int capacite;

    private Resistance resistance;
    private Soufflerie soufflerie;

    public void cuire(int temperature, int duree) {
        if (temperature < 40 || temperature > 250)
            throw new IllegalArgumentException("La température du four doit être comprise en 40 et 250 degrés");
        if (duree <= 0)
            throw new IllegalArgumentException("La durée doit être positive");
        System.out.println("Je cuis un plat à " + temperature + " degrés, pendant " + duree + " minutes.");
    }

    public void cuire(Aliment aliment) {
        System.out.println("Je cuis un aliment : " + aliment.nom);
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " degrés.");
        aliment.estCuit = true;
        maintenir();
    }

    private void maintenir() {

    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        System.out.println("La puissance est modifiée !");
        this.puissance = puissance;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public Soufflerie getSoufflerie() {
        return soufflerie;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}