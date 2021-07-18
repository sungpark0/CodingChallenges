package com.codingChallenge.DesignTwitter;

import java.util.*;

public class DesignTwitter {

    Map<Integer, HashSet<Integer>> users;
    Map<Integer, Map<Integer, Integer>> tweets;
    int size;

    /**
     * Initialize your data structure here.
     */
    public DesignTwitter() {
        users = new HashMap<>();
        tweets = new HashMap<>();
        size = 0;
    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        if (users.get(userId) == null) {
            users.put(userId, new HashSet<>());
            tweets.put(userId, new HashMap<>());
        }

        tweets.get(userId).put(size++, tweetId);
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> list = new ArrayList<>();
        if (users.get(userId) == null) return list;

        Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());

        for (Map.Entry<Integer, Integer> entry : tweets.get(userId).entrySet()) {
            queue.offer(entry);
        }

        for (Integer user : users.get(userId)) {
            for (Map.Entry<Integer, Integer> entry : tweets.get(user).entrySet()) {
                queue.offer(entry);
            }
        }

        for (int i = 0; i < 10 && !queue.isEmpty(); i++) {
            list.add(queue.poll().getValue());
        }

        return list;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) return;

        if (users.get(followerId) == null) {
            users.put(followerId, new HashSet<>());
            tweets.put(followerId, new HashMap<>());
        }

        if (users.get(followeeId) == null) {
            users.put(followeeId, new HashSet<>());
            tweets.put(followeeId, new HashMap<>());
        }

        users.get(followerId).add(followeeId);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        if (followerId == followeeId) return;
        if (users.get(followerId) == null || users.get(followeeId) == null) return;

        users.get(followerId).remove(followeeId);
    }

    public static void main(String[] args) {

    }
}
