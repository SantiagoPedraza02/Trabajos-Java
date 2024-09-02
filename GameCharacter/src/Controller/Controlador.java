package Controller;

import Model.GameCharacter;
import Model.Weapon;


import java.util.Scanner;

public class Controlador {
    private Weapon[] weapons;
    private Scanner scanner;

    public Controlador() {
        this.weapons = new Weapon[]{
                new Weapon("Espada", 15, 10),
                new Weapon("Hacha", 20, 12),
                new Weapon("Ballesta", 12, 8),
                new Weapon("Excalibur", 99, 99),
                new Weapon("lanzas", 28, 24)
        };
        this.scanner = new Scanner(System.in);
    }
    public void ingresarDatos() {
        System.out.println("Ingrese el nombre del personaje:");
        String name = scanner.nextLine();

        System.out.println("Ingrese la salud máxima del personaje:");
        long maxHp = scanner.nextLong();
        scanner.nextLine(); // Limpiar el buffer
        System.out.println("Ingrese la salud actual del personaje:");
        long curHp = scanner.nextLong();
        scanner.nextLine(); // Limpiar el buffer
        GameCharacter c = new GameCharacter(name, maxHp,curHp);

        System.out.println("Seleccione un arma para su personaje:");
        for (int i = 0; i < weapons.length; i++) {
            System.out.println((i + 1) + ". " + weapons[i]);
        }


        int weaponChoice = scanner.nextInt();
        scanner.nextLine();

        if (weaponChoice > 0 && weaponChoice <= weapons.length) {
            c.setMyWeapon(weapons[weaponChoice - 1]);
        } else {
            System.out.println("Selección inválida. No se asignó un arma.");
        }

        System.out.println("Información del personaje creado:");
        System.out.println(c);
    }
}


