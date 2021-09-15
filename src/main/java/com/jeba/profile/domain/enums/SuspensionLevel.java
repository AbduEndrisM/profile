package com.jeba.profile.domain.enums;

/**
 * to  be decided by the team. but for now let's consider
 *
 * EASY: 1 week  / 2 complains in a week
 * MODERATE: 1 Month / 3 complains in a week or 4 complains in a month
 * Hard: 1 year / 5 complains in a week or 7 in a month or 10 in a year
 * Harsh: permanent example: rape/steal
 *
 */
public enum SuspensionLevel {
    EASY, MODERATE, HARD, HARSH
}

