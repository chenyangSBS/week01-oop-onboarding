package edu.course.demo;

import java.util.HashMap;
import java.util.Map;

public class ReservationApp {
    private static final Map<String, Integer> ACTIVE = new HashMap<>();

    public static void main(String[] args) {
        reserve("S001", "STUDENT", "CAMERA-01");
    }

    public static void reserve(
            String userId,
            String userType,
            String resourceId) {
        int current = ACTIVE.getOrDefault(userId, 0);
        int limit = "TEACHER".equals(userType) ? 5 : 2;

        if (current >= limit) {
            System.out.println("预约失败：已达到上限");
            return;
        }

        ACTIVE.put(userId, current + 1);
        System.out.println(
                "预约成功：" + userId + " -> " + resourceId);
        System.out.println("发送通知给：" + userId);
    }
}
