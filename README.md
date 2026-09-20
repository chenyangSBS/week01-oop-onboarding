# 第01周：课程建立、工具链与 Git 基础

从一个能运行但职责混乱的预约程序开始，再用一个边界错误把 Maven、JUnit 和 Git 的基本流程走一遍。

## 环境与验证

- JDK 25
- Maven 3.9+
- JUnit Jupiter 6.1.2

在项目目录下运行：

```bash
mvn test
```

## 课堂入口

- 职责混乱的预约程序：`java -cp target/classes edu.course.demo.ReservationApp`
- 修复后的计数器测试：`mvn -Dtest=edu.course.onboarding.ReservationCounterTest test`

## 教学反例

`edu.course.onboarding.before.ReservationCounter` 里 `count <= limit` 的判断有边界缺陷，对应的测试默认加了 `@Disabled`。把 `@Disabled` 删掉再单独运行测试，会看到断言期望 `false`，实际得到 `true`。

## 目录说明

- `src/main/java`：课堂演示代码和领域代码
- `src/test/java`：回归测试、契约测试，以及教学用的失败测试
- `pom.xml`：独立的 Maven 构建配置
