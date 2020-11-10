package fr.mds.singleton_tp1.tp1;

import fr.mds.singleton_tp1.tp1.entities.Entity1;
import fr.mds.singleton_tp1.tp1.entities.monSingleton;

/**
*
* @author tactfactory
*
* - Modifier le programme pour :
*   - 1 : permettre d'accéder n'importe où dans le projet à la liste d'Entity1
*   - 2 : faire en sorte que les ajouts, suppresions sur la liste d'Entity1 soient préservés durant l'exécution du
*       programme
*   - 3 : que les id des éléments dans la liste ne soient plus saisissables par le développeur et qu'ils deviennent
*       auto-incrémentés
*/
public class SingletonTp1 {
  public static void main(String[] args) {

    System.out.println(String.format("Nombre d'Entity1 %d", monSingleton.getInstance().getResult().stream().count()));
    
    Entity1 e11 = new Entity1();
    e11.setId(15);
    e11.setData("data e1 15");

    monSingleton.getInstance().add(e11);

    Entity1 e12 = new Entity1();
    e12.setId(16);
    e12.setData("data e1 16");

    monSingleton.getInstance().add(e12);

    for (Entity1 item : monSingleton.getInstance().getResult()) {
      System.out.println(item);
    }
  }
}
