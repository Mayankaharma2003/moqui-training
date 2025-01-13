def createRecord = ec.entity.makeValue("moqui.training.MoquiTraining");

if (context.trainingId==null||context.trainingDate==null||context.trainingName==null) {
    ec.message.addError("please enter required fields")
    return
}
Map<String, Object> fields = [
        "trainingId": context.trainingId,
        "trainingName": context.trainingName,
        "trainingDate": context.trainingDate,
        "trainingPrice":context.trainingPrice,
        "trainingDuration":context.trainingDuration
]
createRecord.setAll(fields)
createRecord = createRecord.create()
context.trainingId = createRecord.get("trainingId")
