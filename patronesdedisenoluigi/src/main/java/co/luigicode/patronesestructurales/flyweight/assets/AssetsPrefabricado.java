package co.luigicode.patronesestructurales.flyweight.assets;

import java.util.HashMap;
import java.util.Map;

public class AssetsPrefabricado {

    private static Map<Integer, Prefabricado> prefabs = new HashMap<>();

    public static Prefabricado getPrefabricado(Prefabricado prefabricado) {
        int id = prefabricado.getId();

        if (!prefabs.containsKey(id))
            prefabs.put(id, prefabricado);
        return prefabs.get(id);
    }
}
