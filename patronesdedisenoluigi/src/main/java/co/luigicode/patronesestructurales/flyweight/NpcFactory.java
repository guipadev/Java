package co.luigicode.patronesestructurales.flyweight;

import co.luigicode.patronesestructurales.flyweight.assets.AssetsPrefabricado;
import co.luigicode.patronesestructurales.flyweight.assets.Prefabricado;

public class NpcFactory {

    public static Npc creacionNpc(Prefabricado prefabricado) {
        Prefabricado prefabricadoNew = AssetsPrefabricado.getPrefabricado(prefabricado);
        Npc npc = new Npc(prefabricadoNew);
        return npc;
    }
}
