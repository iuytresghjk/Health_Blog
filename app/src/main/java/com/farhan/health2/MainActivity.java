package com.farhan.health2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArticlesAdapter adapter;
    List<Article> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
            actionBar.setTitle("Health Blogs");


        recyclerView = findViewById(R.id.recyclerView);
        data = getArticlesData();
        adapter = new ArticlesAdapter(this, data);


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Article> getArticlesData() {
        List<Article> articles = new ArrayList<>();
        Article article = new Article(
                "Transform Your Life with the Power of Positive Self-Talk",
                "Deborah Roth",
                "Positive thinking is a powerful tool that can help to improve your mental health and well-being. It involves using positive self-talk, or the practice of consciously replacing negative thoughts and self-talk with positive and supportive statements. By focusing on the positive and cultivating a positive mindset, you can reduce stress, anxiety, and depression, and increase feelings of happiness, optimism, and resilience.",
                R.drawable.image1
        );
        articles.add(article);

         article = new Article(
                "Fear of Success: How to Overcome Self-Doubt and Achieve Your Goals",
                "Deborah Roth",
                "Fear of success is a common phenomenon that affects many individuals, and can often prevent them from achieving their full potential. This fear stems from a range of underlying factors, including self-doubt, imposter syndrome, and a fear of the unknown. However, by recognizing the signs of fear of success and taking steps to address these underlying factors, it is possible to overcome these obstacles and achieve your goals.",
                R.drawable.image2
        );
        articles.add(article);

        article = new Article(
                "The Importance of Mental Health Days for Employee Well-Being",
                "Deborah Roth",
                "In today’s fast-paced and demanding work environment, taking time off for mental health is essential for employee well-being. Mental health days are just as important as sick days, vacation days, and other types of leave. They allow employees to take a break from work-related stress and focus on their mental health, which ultimately benefits both the employee and the organization they work for.",
                R.drawable.image3
        );
        articles.add(article);

        article = new Article(
                "Exercise for Mental Health: Why it Matters and How to Get Started",
                "Deborah Roth",
                "Mental health is an essential aspect of our overall well-being, and exercise can play a significant role in improving and maintaining it. Studies have shown that regular exercise can help reduce symptoms of depression and anxiety, increase self-esteem and confidence, and improve overall mood.\n" +
                        "\n" +
                        "Why Exercise Matters for Mental Health?\n" +
                        "\n" +
                        "Physical activity releases endorphins, which are natural feel-good chemicals in the brain that can boost mood and reduce stress. Regular exercise can also stimulate the growth of new brain cells, which is essential for improving cognitive function and reducing the risk of developing mental health problems.",
                R.drawable.image4
        );
        articles.add(article);

        article = new Article(
                "Healthy Eating on a Budget: Tips and Tricks",
                "Deborah Roth",
                "Healthy eating is essential for a healthy lifestyle, but it can be challenging to eat well when you’re on a tight budget. Fortunately, with a little planning and creativity, you can eat nutritious, delicious meals while staying within your budget. Here are some tips and tricks to help you achieve this goal:\n" +
                "\n" +
                "Plan your meals in advance: Planning your meals in advance can help you save money by reducing food waste and avoiding impulse purchases at the grocery store. Make a list of meals for the week and shop for ingredients based on this list.",
                R.drawable.image5
        );
        articles.add(article);

        article = new Article(
                "Sneeze Less, Laugh More",
                "Deborah Roth",
                "Allergies are a common condition that affects millions of people worldwide. While traditional treatments such as medications and allergen immunotherapy can be effective, some individuals may be looking for alternative approaches to managing their allergies." +
                "\n" +
                "One alternative approach to treating allergies is the use of natural remedies. This can include the use of supplements, such as vitamin C, quercetin, and bromelain, which have been shown to have anti-inflammatory properties and can help reduce allergy symptoms. Herbs such as butterbur, stinging nettle, and ginger have also been found to be effective in treating allergies.",
                R.drawable.image6
        );
        articles.add(article);

        article = new Article(
                "Sleep hygiene can change your life",
                "Deborah Roth",
                "Sleep hygiene refers to the habits and practices that promote good sleep. It includes factors such as maintaining a consistent sleep schedule, creating a comfortable sleep environment, and avoiding certain substances and activities before bed." +
                "\n" +
                "Adequate and consistent sleep is essential for good physical and mental health. It is during sleep that the body repairs and rejuvenates itself, and a lack of sleep can lead to a number of negative health outcomes. For example, chronic sleep deprivation has been linked to an increased risk of obesity, diabetes, heart disease, and stroke. It also impairs cognitive function, making it harder to focus and make decisions.",
                R.drawable.image7
        );
        articles.add(article);

        article = new Article(
                "Work Can Harm You",
                "Deborah Roth",
                "Work-life balance is a concept that refers to the balance between an individual’s professional and personal responsibilities. With the rise of technology and the 24/7 nature of modern work, it can be increasingly difficult to separate work from personal life. This can lead to increased stress and burnout , negatively impacting an individual’s physical and mental health ." +
                "\n" +
                "Research has shown that individuals who have a poor work-life balance are more likely to suffer from chronic health conditions such as heart disease, diabetes, and obesity. They are also more likely to experience mental health issues such as depression and anxiety. In addition, a poor work-life balance can lead to decreased productivity and job dissatisfaction.",
                R.drawable.image8
        );
        articles.add(article);article = new Article(
                "Managing Stress with Mindfulness\n",
                "Deborah Roth",
                "Mindfulness is the practice of being fully present and engaged in the current moment, without judgment. It is a state of active, open attention to the present. This kind of attention nurtures greater awareness, clarity, and acceptance of present-moment reality. Mindfulness can be cultivated through various techniques, such as meditation, yoga, and tai chi./7 nature of modern work, it can be increasingly difficult to separate work from personal life. This can lead to increased stress and burnout , negatively impacting an individual’s physical and mental health ." +
                "\n" +
                "Stress is a natural part of life, but it can become overwhelming and harmful if not managed properly. Chronic stress can lead to a variety of health problems, including anxiety, depression, and cardiovascular disease. Mindfulness is a powerful tool for managing stress and promoting overall well-being.",
                R.drawable.image9
        );
        articles.add(article);article = new Article(
                "Diet to follow in 2023",
                "Deborah Roth",
                "Many people are looking to make healthy changes to their diet in order to improve their overall health and wellbeing. With so many different diets and eating plans to choose from, it can be difficult to know which one is the best for you. In this article, we’ll take a look at some of the top diets for 2023 and explore their potential benefits and drawbacks, so you can make an informed decision about which one is right for you" +
                "\n" +
                "One of the most popular diets for 2023 is the Mediterranean diet. This diet is based on the traditional eating habits of countries like Greece, Italy, and Spain and is rich in fruits, vegetables, whole grains, and healthy fats, such as olive oil. Studies have shown that this diet can help to improve cardiovascular health, lower the risk of diabetes and some types of cancer. In addition, this diet is also low in red meat, processed foods and sugary drinks, which can have negative effects on our health.",
                R.drawable.image10
        );
        articles.add(article);article = new Article(

                "Longevity diet tips",
                "Deborah Roth",
                "Negative effects of poor diet gravely affect patients’ health. Eating a healthy diet is one of the most important things you can do to improve your overall health and increase your chances of living a longer life. However, with so much conflicting information out there about what constitutes a “healthy” diet, it can be difficult to know where to start. In this article, I’ll take a look at some of the key principles of eating to live longer, and provide some practical tips for incorporating these principles into your daily life." +
                "\n" +
                "One of the most important things you can do to “eat to live longer” is to focus on nutrient-dense foods. These are foods that are high in vitamins, minerals, and other essential nutrients, and relatively low in calories. Some examples of nutrient-dense foods include leafy green vegetables, berries, nuts, and lean proteins such as fish and poultry. These foods can help to lower the risk of chronic diseases such as heart disease, diabetes, and certain types of cancer.",
                R.drawable.image11
        );
        articles.add(article);



        return articles;
    }
}
