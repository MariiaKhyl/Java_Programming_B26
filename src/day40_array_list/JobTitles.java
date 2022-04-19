package day40_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {

        ArrayList<String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET","Developer","PO","CEO","DevOps","QA","BA","Chef","Doctor","Police Officer","PO"));
        System.out.println("Original "+allJobs);

        ArrayList<String> job1 = new ArrayList<>(allJobs);
        job1.removeAll(Arrays.asList("PO","QA","BA"));
        System.out.println(job1);

        ArrayList<String> job2 = new ArrayList<>(allJobs);
        job2.retainAll(Arrays.asList("SDET","Developer","DevOps","PO"));
        System.out.println(job2);

        ArrayList<String> job3 = new ArrayList<>(allJobs);
        System.out.println(job3.containsAll(Arrays.asList("Chef","CEO")));
        System.out.println(job3.containsAll(Arrays.asList("Doctor","Nurse")));

    }
}
