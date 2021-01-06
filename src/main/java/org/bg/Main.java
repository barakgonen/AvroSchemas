package org.bg;

import org.bg.avro.structures.base.objects.Coordinate;
import org.bg.avro.structures.base.objects.Employee;
import org.bg.avro.structures.base.objects.NullableTime;
import org.bg.avro.structures.base.objects.Time;
import org.bg.avro.structures.objects.Manager;
import org.joda.time.DateTime;

public class Main {
    public static void main(String[] args){
        System.out.println("BGBG");
        Manager manager = Manager.newBuilder()
                .setEmployeeProp(Employee.newBuilder()
                        .setActive(true)
                        .setSalary(12323)
                        .setName("bgbg")
                        .build())
                .setHappy(true)
                .setNullableTime(NullableTime.newBuilder().setTimeMillis(DateTime.now().toDateTime().getMillis()).build())
                .setPosition(Coordinate.newBuilder().setAltitude(23).setLat(233).setLon(2331).build())
                .setMustAppearTimeField(Time.newBuilder().setTimeMllis(231111111).build())
                .build();
        System.out.println(manager);
//        manager.getSchema().getFields().stream().forEach(field -> {
//            String fieldName = StringUtils.capitalize(field.name());
//            switch (field.schema().getType()){
//                case RECORD:
//                    System.out.println("HANDLE RECORD BRO");
//                    break;
//                case ENUM:
//                    break;
//                case ARRAY:
//                    break;
//                case MAP:
//                    break;
//                case UNION:
//                    break;
//                case FIXED:
//                case STRING:
//                case BYTES:
//                case INT:
//                case LONG:
//                case FLOAT:
//                case DOUBLE:
//                case BOOLEAN:
//                    try {
//                        Method method = Class.forName(manager.getClass().getName()).getMethod("get" + fieldName);
//                        System.out.println("field name: " + fieldName + ", getValue(): " + method.invoke(manager));
//                    } catch (NoSuchMethodException | ClassNotFoundException | IllegalAccessException | InvocationTargetException e) {
//                        e.printStackTrace();
//                    }
//                    break;
//                case NULL:
//                    break;
//            }
//        });
//        manager.getSchema().getFields().stream().forEach(field -> {System.out.println(field.name());});
//        manager.getSchema().getFields().stream().forEach(field -> System.out.println(field.getObjectProps().get("name")));
    }
}
