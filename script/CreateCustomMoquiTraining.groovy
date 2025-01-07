def trainingRecord = ec.entity.makeValue("moqui.training.MoquiTraining")

def trainingId=context.trainingId
def trainingName = context.trainingName
def trainingDate = context.trainingDate
def trainingPrice = context.trainingPrice
def trainingDuration = context.trainingDuration

if (!trainingId==null) {
    ec.message.addError("Training Id is required.")
    return
}

if (!trainingName==null) {
    ec.message.addError("Training name is required.")
    return
}

if (trainingDate==null) {
    ec.message.addError("Training date is required.")
    return
}


trainingRecord.set("trainingId", trainingId)
trainingRecord.set("trainingName", trainingName)
trainingRecord.set("trainingDate", trainingDate)

if (trainingPrice != null) trainingRecord.set("trainingPrice", trainingPrice)
if (trainingDuration != null) trainingRecord.set("trainingDuration", trainingDuration)

trainingRecord = trainingRecord.create()

context.trainingId = trainingRecord.get("trainingId")