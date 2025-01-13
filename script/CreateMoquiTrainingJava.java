import org.moqui.context.ExecutionContext;
import org.moqui.entity.EntityValue;
import org.moqui.entity.*;
import java.util.Map;

public class CreateMoquiTrainingJava{
    public static void main(String[] args) {
        System.out.println("hii");
    }

    public static void createMoquiTrainingRecord(ExecutionContext ec, Map<String, Object> context) {
        if (context.get("trainingId") == null || context.get("trainingName") == null || context.get("trainingDate") == null) {
            ec.getMessage().addError("Enter all fields");
            return;
        }

        EntityValue trainingRecord = ec.getEntity().makeValue("moqui.training.MoquiTraining");
        trainingRecord.set("trainingId", context.get("trainingId"));
        trainingRecord.set("trainingName", context.get("trainingName"));
        trainingRecord.set("trainingDate", context.get("trainingDate"));
        trainingRecord.set("trainingPrice", context.get("trainingPrice"));
        trainingRecord.set("trainingDuration", context.get("trainingDuration"));

        trainingRecord=trainingRecord.create();

        context.put("trainingId", trainingRecord.get("trainingId"));
    }
}
