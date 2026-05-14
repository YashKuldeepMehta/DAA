import java.util.*;

public class GroupFilesByOwner {

    public static Map<String, List<String>> groupAndSortOwners(Map<String, String> files) {
        Map<String, List<String>> result = new HashMap<>();
        for (Map.Entry<String, String> entry : files.entrySet()) {
            String fileName = entry.getKey();
            String owner = entry.getValue();

            result.putIfAbsent(owner, new ArrayList<>());
            result.get(owner).add(fileName);
        }

        for (List<String> fileList : result.values()) {
            Collections.sort(fileList);
        }

        return result;
    }

    public static void main(String[] args) {
        Map<String, String> files = new HashMap<>();
        files.put("Input.txt", "Albert");
        files.put("Code.py", "Stanley");
        files.put("Output.txt", "Albert");
        files.put("btech.txt", "Albert");

        Map<String, List<String>> grouped = groupAndSortOwners(files);

        System.out.println(grouped);
    }
}