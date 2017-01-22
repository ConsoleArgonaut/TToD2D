package source;

/**
 * Created by Drake on 21.01.2017.
 */
public class StatusController {
    public Status getStatus(Types.effect type){

        Status statusToDefine = new Status();
        switch (type){
            case Good:
                statusToDefine.setName("Good");
                statusToDefine.setPotency(0);
                statusToDefine.setDuration(0);
                break;
            case Unrelenting:
                statusToDefine.setName("Unrelenting");
                statusToDefine.setPotency(1);
                statusToDefine.setDuration(3);
                break;
            case Stunned:
                statusToDefine.setName("Stunned");
                statusToDefine.setPotency(1);
                statusToDefine.setDuration(2);
                break;
            case Burning:
                statusToDefine.setName("Burning");
                statusToDefine.setPotency(50);
                statusToDefine.setDuration(3);
                break;
            case Freezing:
                statusToDefine.setName("Freezing");
                statusToDefine.setPotency(50);
                statusToDefine.setDuration(3);
                break;
            case Poisoned:
                statusToDefine.setName("Poisoned");
                statusToDefine.setPotency(50);
                statusToDefine.setDuration(3);
                break;
            case Constipated:
                statusToDefine.setName("Constipated");
                statusToDefine.setPotency(50);
                statusToDefine.setDuration(6);
                break;
        }
        return statusToDefine;
    }
}
