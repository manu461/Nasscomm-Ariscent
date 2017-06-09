import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by staLker on 06-06-2017.
 */
public class AllAssets {
    private List<Assets> allAssetsList;
    private static AllAssets allAssets;
    private AllAssets(){
        allAssetsList = new ArrayList<>();
        for(int i=0;i<10;i++){
                Assets assets = new Assets("name "+i , i+12 , i+100);
                assets.setSourceAddress(i+132, "streetSRCName"+i, "districtSRC"+i, i+121, "stateSRC"+i);
                assets.setDestinationAddress(i+32, "streetDSTName"+i, "districtDST"+i, i+21, "stateDST"+i);
                allAssetsList.add(assets);
        }
    }
    public static AllAssets get(){
        if(allAssets == null){
            allAssets = new AllAssets();
            return allAssets;
        }
        return allAssets;
    }
    public Assets getAsset(UUID id){
        for(Assets asset : allAssetsList){
            if(asset.getId().equals(id)){
                return asset;
            }
        }
        return null;
    }
}
